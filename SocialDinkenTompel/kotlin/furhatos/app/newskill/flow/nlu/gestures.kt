package furhatos.app.newskill.flow.nlu

import furhatos.gestures.ARKitParams
import furhatos.gestures.BasicParams
import furhatos.gestures.defineGesture

val Sleep = defineGesture("sleep") {
    reset(0.1)
    frame(0.4, persist = true) {
        ARKitParams.EYE_BLINK_RIGHT to 1.0
        ARKitParams.EYE_BLINK_LEFT to 1.0
        BasicParams.NECK_TILT to 20.0
    }
}



//We piloted with the furhat "waking up" in the beginning of the interaction but this starteled the infants and led
// to crying, which is why we changed the code to exclude this gesture.

//val WakeUp = defineGesture("WakeUp") {
//    reset(0.1)
//    frame(0.1, 0.3){
//        ARKitParams.EYE_BLINK_LEFT to 1.0
//        ARKitParams.EYE_BLINK_RIGHT to 1.0
//
//        BasicParams.NECK_TILT to 15.0
//
//        BasicParams.EXPR_SAD to 0.0
//    }
//    frame(0.3, 0.5){
//        ARKitParams.EYE_BLINK_LEFT to 0.9
//        ARKitParams.EYE_BLINK_RIGHT to 0.9
//
//        BasicParams.NECK_PAN to 15.0
//
//
//        ARKitParams.BROW_DOWN_LEFT to -2.0
//        ARKitParams.BROW_DOWN_RIGHT to -2.0
//    }
//    frame(0.5, 0.7){
//        ARKitParams.EYE_BLINK_LEFT to 0.8
//        ARKitParams.EYE_BLINK_RIGHT to 0.8
//
//        BasicParams.NECK_PAN to -15.0
//    }
//    frame(0.7, 0.9){
//        ARKitParams.EYE_BLINK_LEFT to 0.8
//        ARKitParams.EYE_BLINK_RIGHT to 0.8
//
//        ARKitParams.BROW_DOWN_LEFT to -2.0
//        ARKitParams.BROW_DOWN_RIGHT to -2.0
//
//        BasicParams.NECK_PAN to 15.0
//    }
//    frame(0.9, 1.1){
//        ARKitParams.EYE_BLINK_LEFT to 0.5
//        ARKitParams.EYE_BLINK_RIGHT to 0.5
//
//        BasicParams.NECK_PAN to -15.0
//    }
//    frame(1.1, 1.4){
//        ARKitParams.EYE_BLINK_LEFT to 0.2
//        ARKitParams.EYE_BLINK_RIGHT to 0.2
//
//        BasicParams.NECK_PAN to 15.0
//    }
//    frame(1.4, 1.6){
//        ARKitParams.EYE_BLINK_LEFT to 0.8
//        ARKitParams.EYE_BLINK_RIGHT to 0.8
//
//        ARKitParams.BROW_DOWN_LEFT to -1.0
//        ARKitParams.BROW_DOWN_RIGHT to -1.0
//
//        BasicParams.NECK_PAN to 0.0
//        BasicParams.NECK_TILT to 0.0
//    }
//    frame(1.6, 1.8){
//        ARKitParams.EYE_BLINK_LEFT to 0.1
//        ARKitParams.EYE_BLINK_RIGHT to 0.1
//
//        ARKitParams.BROW_DOWN_LEFT to -0.5
//        ARKitParams.BROW_DOWN_RIGHT to -0.5
//    }
//    frame(1.6, 1.8){
//        ARKitParams.EYE_BLINK_LEFT to 1.0
//        ARKitParams.EYE_BLINK_RIGHT to 1.0
//
//        ARKitParams.BROW_DOWN_LEFT to -0.1
//        ARKitParams.BROW_DOWN_RIGHT to -0.1
//    }
//    frame(1.8, 2.0){
//        ARKitParams.EYE_BLINK_LEFT to 0.1
//        ARKitParams.EYE_BLINK_RIGHT to 0.1
//
//        ARKitParams.BROW_DOWN_LEFT to 0.0
//        ARKitParams.BROW_DOWN_RIGHT to 0.0
//    }
//    frame(2.0, 2.2){
//        ARKitParams.EYE_BLINK_LEFT to 1.0
//        ARKitParams.EYE_BLINK_RIGHT to 1.0
//    }
//    frame(2.2, 2.3){
//        ARKitParams.EYE_BLINK_LEFT to 0.0
//        ARKitParams.EYE_BLINK_RIGHT to 0.0
//    }
//    reset(2.3)
//}

val yawn = defineGesture("yawn") {
    reset(0.1)
    frame(0.32, 2.5) {
        ARKitParams.EYE_BLINK_LEFT to 1.0
        ARKitParams.EYE_BLINK_RIGHT to 1.0
        ARKitParams.BROW_DOWN_LEFT to -1
        ARKitParams.BROW_DOWN_RIGHT to -1
    }
    frame(0.5, 0.6){
        ARKitParams.JAW_OPEN to 0.1
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(0.6, 0.7){
        ARKitParams.JAW_OPEN to 0.2
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(0.7, 0.8){
        ARKitParams.JAW_OPEN to 0.3
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(0.8, 0.9){
        ARKitParams.JAW_OPEN to 0.4
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(0.9, 1.0) {
        ARKitParams.JAW_OPEN to 0.5
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.0, 1.1) {
        ARKitParams.JAW_OPEN to 0.6
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.1, 1.2){
        ARKitParams.JAW_OPEN to 0.7
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.2, 1.3){
        ARKitParams.JAW_OPEN to 0.8
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.3, 1.4){
        ARKitParams.JAW_OPEN to 0.7
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.4, 1.5){
        ARKitParams.JAW_OPEN to 0.6
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.5, 1.6) {
        ARKitParams.JAW_OPEN to 0.5
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.6, 1.7) {
        ARKitParams.JAW_OPEN to 0.4
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.7, 1.8) {
        ARKitParams.JAW_OPEN to 0.3
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.8, 1.9) {
        ARKitParams.JAW_OPEN to 0.2
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(1.9, 2.0) {
        ARKitParams.JAW_OPEN to 0.1
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    frame(2.0, 3.0) {
        ARKitParams.JAW_OPEN to 0.0
        ARKitParams.MOUTH_CLOSE to 0.0
    }
    reset(2.6)
}

val WinkLe = defineGesture("WinkLe") {
    reset(0.1)
    frame(0.30, 2.0) {
        ARKitParams.EYE_BLINK_LEFT to 1.0
        ARKitParams.EYE_SQUINT_LEFT to 1.0
        ARKitParams.BROW_DOWN_LEFT to 1.0
        ARKitParams.JAW_LEFT to 1.0
        ARKitParams.MOUTH_DIMPLE_LEFT to 1.0
        BasicParams.NECK_PAN to -15
    }
    reset(2.1)
}

val WinkRi = defineGesture("WinkRi") {
    reset(0.1)
    frame(0.30, 2.0) {
        ARKitParams.EYE_BLINK_RIGHT to 1.0
        ARKitParams.EYE_SQUINT_RIGHT to 1.0
        ARKitParams.BROW_DOWN_RIGHT to 1.0
        ARKitParams.JAW_RIGHT to 1.0
        ARKitParams.MOUTH_DIMPLE_RIGHT to 1.0
        BasicParams.NECK_PAN to 15
    }
    reset(2.1)
}