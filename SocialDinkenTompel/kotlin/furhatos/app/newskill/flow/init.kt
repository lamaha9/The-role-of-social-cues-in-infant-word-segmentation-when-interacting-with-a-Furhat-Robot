package furhatos.app.newskill.flow

import furhatos.app.newskill.flow.main.Asking
import furhatos.app.newskill.setting.DISTANCE_TO_ENGAGE
import furhatos.app.newskill.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.util.Gender
import furhatos.util.Language

val Init: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
        furhat.voice = Voice(gender = Gender.FEMALE, language = Language.GERMAN, pitch = "high", rate = 1.1)

    }
    onEntry {
        furhat.attendAll()
        furhat.stopSpeaking()
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse("Hallo"){
        val userThatSpoke = it.userId
        furhat.attend(userThatSpoke)
        furhat.attend(it.userId)
        goto(Asking)
    }
    onNoResponse{reentry()}
    onResponse{reentry()}

}
