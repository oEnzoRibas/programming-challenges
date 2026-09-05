module Darts (score) where

type Point = (Double, Double)

dist :: Point -> Point -> Double
dist (x1,y1) (x2,y2) = 
    let
        dx = x2-x1
        dy = y2-y1
    in
        sqrt (dx ** 2 + dy ** 2)

score :: Float -> Float -> Int
score x y
    | d > 10.0 = 0
    | d > 5.0 = 1
    | d > 1.0 = 5
    | otherwise = 10
    where
        d = dist (realToFrac x,realToFrac y) (0.0,0.0)