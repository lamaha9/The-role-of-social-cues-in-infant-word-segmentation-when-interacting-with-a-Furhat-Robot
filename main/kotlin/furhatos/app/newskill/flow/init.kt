package furhatos.app.newskill.flow

import furhatos.app.newskill.flow.main.passages
import furhatos.app.newskill.setting.DISTANCE_TO_ENGAGE
import furhatos.app.newskill.setting.MAX_NUMBER_OF_USERS
import furhatos.autobehavior.setDefaultMicroexpression
import furhatos.autobehavior.userSpeechStartGesture
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.records.Location
import furhatos.util.Gender
import furhatos.util.Language

val Init: State = state {
    init {
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
        furhat.voice = Voice(gender = Gender.FEMALE, language = Language.GERMAN, pitch = "high", rate = 1.1)
    }
    onEntry {
        furhat.setDefaultMicroexpression(blinking = false, facialMovements= false, eyeMovements = false)
        val location = Location(0.0, -0.7, 2.0)
        furhat.attend(location)
        furhat.userSpeechStartGesture = listOf()
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse("Geschichte"){
        goto(passages)
    }
    onNoResponse{reentry()}
    onResponse{reentry()}

}
