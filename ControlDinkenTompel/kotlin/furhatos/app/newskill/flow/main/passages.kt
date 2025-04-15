package furhatos.app.newskill.flow.main

import furhatos.app.newskill.flow.Parent
import furhatos.autobehavior.setDefaultMicroexpression
import furhatos.flow.kotlin.*


val passages: State= state (Parent) {
    onEntry {
        furhat.setDefaultMicroexpression(blinking = false, facialMovements= false, eyeMovements = false)

       furhat.say{+Audio("classpath:Tompel.wav", "AUFNAHME",speech = true) }

       furhat.say{+Audio("classpath:Dinken.wav", "AUFNAHME",speech = true) }
    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}
