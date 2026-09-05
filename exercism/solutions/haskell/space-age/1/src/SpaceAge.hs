module SpaceAge (Planet(..), ageOn) where

data Planet = Mercury
            | Venus
            | Earth
            | Mars
            | Jupiter
            | Saturn
            | Uranus
            | Neptune

secondsToEarthYears :: Float -> Float
secondsToEarthYears seconds =
            (seconds / (60 * 60 * 24 * 365.25))
            
ageOn :: Planet -> Float -> Float
ageOn planet seconds = 
            let years = secondsToEarthYears seconds
            in case planet of
              Mercury -> years / 0.2408467
              Venus   -> years / 0.61519726
              Earth   -> years / 1.0
              Mars    -> years / 1.8808158
              Jupiter -> years / 11.862615
              Saturn  -> years / 29.447498
              Uranus  -> years / 84.016846
              Neptune -> years / 164.79132