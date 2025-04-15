package furhatos.app.newskill.flow.main
import furhatos.app.newskill.flow.Parent
import furhatos.autobehavior.setDefaultMicroexpression
import furhatos.flow.kotlin.*




val passages: State= state (Parent) {
    onEntry {
        furhat.setDefaultMicroexpression(blinking = false, facialMovements= false, eyeMovements = false)


       furhat.say{+Audio("classpath:Gelfen.wav", "AUFNAHME",speech = true) }

       furhat.say{+Audio("classpath:Pansel.wav", "AUFNAHME",speech = true) }

    }
    onResponse{reentry()}
    onNoResponse { reentry() }
}

