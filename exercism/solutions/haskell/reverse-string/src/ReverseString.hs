module ReverseString (reverseString) where

reverseString :: String -> String
reverseString str = reverser str []
  where
    reverser [] acc = acc
    reverser (x:xs) acc = reverser xs (x:acc)