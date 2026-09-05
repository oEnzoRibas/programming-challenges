// ovenTime returns the amount in minutes that the lasagna should stay in the
// oven.

const short OVEN_TIME_IN_MINUTES = 40;
const short LAYER_PREPARATION_TIME_IN_MINUTES = 2;

short ovenTime() {
    // TODO: Return the correct time.
    return OVEN_TIME_IN_MINUTES;
}

/* remainingOvenTime returns the remaining
   minutes based on the actual minutes already in the oven.
*/
short remainingOvenTime(short actualMinutesInOven) {
    // TODO: Calculate and return the remaining in the oven based on the time
    // the lasagna has already been there.
    return OVEN_TIME_IN_MINUTES-actualMinutesInOven;
}

/* preparationTime returns an estimate of the preparation time based on the
   number of layers and the necessary time per layer.
*/
short preparationTime(short numberOfLayers) {
    // TODO: Calculate and return the preparation time with the
    // `numberOfLayers`.
    return LAYER_PREPARATION_TIME_IN_MINUTES * numberOfLayers;
}

// elapsedTime calculates the total time spent to create and bake the lasagna so
// far.
short elapsedTime(short numberOfLayers, short actualMinutesInOven) {
    // TODO: Calculate and return the total time so far.
    return preparationTime(numberOfLayers) + actualMinutesInOven;
}
