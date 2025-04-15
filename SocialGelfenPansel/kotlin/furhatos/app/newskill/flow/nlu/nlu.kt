package furhatos.app.newskill.flow.nlu
import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Praise : EnumEntity(stemming = true, speechRecPhrases = true) {
    override fun getEnum(lang: Language): List<String> {
        return listOf("Wow", "Toll", "Cool", "Super")
    }
}


