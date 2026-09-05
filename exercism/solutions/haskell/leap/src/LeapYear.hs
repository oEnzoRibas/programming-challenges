module LeapYear (isLeapYear) where

isLeapYear :: Integer -> Bool
isLeapYear year 
    | year < 0 = error "Year must be a non-negative integer"
    | otherwise = (year `mod` 4 == 0 && year `mod` 100 /= 0) || (year `mod` 400 == 0)