package furhatos.app.newskill.flow.main

import furhatos.app.newskill.flow.Parent
import furhatos.app.newskill.flow.nlu.*
import furhatos.autobehavior.setDefaultMicroexpression
import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import furhatos.nlu.common.Yes
import furhatos.skills.UserManager.other


val Asking: State = state(Parent) {
    onEntry {
        furhat.say{ +Audio("classpath:Wer bist du.wav", "AUFNAHME", speech = true) }
        furhat.listen()
    }
    onReentry { furhat.listen() }
    onResponse("Ich heiße Lara"){
        furhat.attend(other)
        furhat.say { +Audio("classpath:Hallo Lara.wav", "AUFNAHME", speech = true) }
        furhat.gesture(Gestures.BigSmile(0.6, 2.5))
        goto(Child)
    }
    onResponse("Ich bin Lara") {
        val userThatSpoke = it.userId
        furhat.attend(userThatSpoke)
        furhat.say { +Audio("classpath:Hallo Lara.wav", "AUFNAHME", speech = true) }
        furhat.gesture(Gestures.BigSmile(0.6, 2.5))
        goto(Child)
    }
    
    onResponse { reentry() }
    onNoResponse { reentry() }
}


val Child: State = state(Parent) {
    onEntry {
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse("Und das ist") {
        furhat.attend(other)
        furhat.say { +Audio("classpath:Schön dass du da bsit.wav", "AUFNAHME", speech = true) }
        furhat.gesture(Gestures.BigSmile(0.6, 2.5))
        goto(Name)
    }

    onResponse{reentry()}
    onNoResponse { reentry() }
}

val Name: State = state (Parent) {
    onEntry {
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse("Wie heißt du?") {
        furhat.attend(other)
        furhat.say{+Audio("classpath:Mein Name ist.wav", "AUFNAHME",speech = true)}
        goto(Colour)
    }
    onResponse{reentry()}
    onNoResponse { reentry() }

}

val Colour: State = state(Parent) {
    onEntry {
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse("blau") {
        furhat.say{+Audio("classpath:Blau ist schön.wav", "AUFNAHME",speech = true) }
        furhat.gesture(Gestures.Wink, async = false)
        goto(WinkI)
    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}

val WinkI: State = state (Parent) {
    onEntry {
        furhat.listen(maxSpeech = 10000)
    }
    onReentry{furhat.listen()}
    onResponse("Cool") {
        furhat.say{+Audio("classpath:Ich probiers mal.wav", "AUFNAHME",speech = true) }
        goto(WinkL)
    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}

val WinkL: State = state (Parent) {
    onEntry {
        furhat.setDefaultMicroexpression(blinking = false, facialMovements= false, eyeMovements = true)
        furhat.say{+Audio("classpath:links.wav", "AUFNAHME",speech = true) }
        delay(500)
        furhat.gesture(WinkLe, async = false)
        delay(400)
        goto(WinkR)
    }
}


val WinkR: State = state (Parent) {
    onEntry {
        furhat.setDefaultMicroexpression(blinking = false, facialMovements= false, eyeMovements = true)
        furhat.say{+Audio("classpath:rechts.wav", "AUFNAHME", speech=true)}
        delay(200)
        furhat.gesture(WinkRi, async = false)
        delay(200)
        furhat.say{+Audio("classpath:hat geklappt.wav", "AUFNAHME",speech = true) }
        goto(Roll)
    }

}

val Roll: State = state (Parent) {
    onEntry {
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse<Praise>{
        furhat.say{+Audio("classpath:Kopfrollen.wav", "AUFNAHME",speech = true) }
        delay(500)
        furhat.say{+Audio("classpath:Kopfrollen2.wav", "AUFNAHME",speech = true) }
        furhat.gesture(Gestures.Roll, async = false)
        furhat.say{+Audio("classpath:Kopfrollen3.wav", "AUFNAHME",speech = true) }
        goto(End)
    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}

val End: State = state (Parent) {
    onEntry {
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse<Yes>{
        furhat.say{+Audio("classpath:Supi.wav", "AUFNAHME",speech = true) }
        goto(Geschichte)
    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}

val Geschichte: State= state (Parent) {
    onEntry {
        furhat.listen()
    }
    onReentry{furhat.listen()}
    onResponse("Geschichte"){
        val userThatSpoke = it.userId
        furhat.attend(userThatSpoke)
        furhat.attend(other)

        furhat.say{+Audio("classpath:Geschichte.wav", "AUFNAHME",speech = true) }

       furhat.say{+Audio("classpath:Gelfen.wav", "AUFNAHME",speech = true) }

       furhat.say{+Audio("classpath:Pansel.wav", "AUFNAHME",speech = true) }

       //furhat.say{+Audio("classpath:Tompel.wav", "AUFNAHME",speech = true) }

       //furhat.say{+Audio("classpath:Dinken.wav", "AUFNAHME",speech = true) }


        goto(Abschied)
    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}

val Abschied: State = state (Parent) {
    onEntry {
        furhat.say {
            +Audio(url = "classpath:Abschluss.wav", text = "AUFNAHME", speech = true)
        }
        goto(yawns)
    }
}

val yawns: State=state (Parent) {
    onEntry{

        furhat.gesture(yawn, async = true)
        furhat.say{+Audio("classpath:Gähnen.wav", "AUFNAHME") }
        goto(sleep)
    }
}

val sleep: State= state(Parent){
    onEntry{
        furhat.say{+Audio("classpath:Abschluss2.wav", "AUFNAHME",speech = true) }
        furhat.gesture(Sleep, async = false)
        raise("SleepEvent")
    }
}
