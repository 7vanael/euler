(ns euler.level1.problem011-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem011 :refer :all :as problem011]))

; https://projecteuler.net/problem=11

#_(In the 20 x 20 grid, four numbers along a diagonal line-
      have been marked in red. The product of these numbers
       26 x 63 x 78 x 14 = 1788696,
      What is the greatest product of four adjacent numbers
      in the same direction - up down left right or diagonally)

(def grid4 [[ 1  2  3  4]
           [ 5  6  7  8]
           [ 9 10 11 12]
           [13 14 15 16]])

(def grid3 [[1 2 3]
            [4 5 6]
            [7 8 9]])

(describe "Euler Problem #11"

  (it "finds the max product in a single row"
    (should= 72 (max-product-in-row 2 [7 8 9]))
    (should= 30 (max-product-in-row 2 [4 5 6])))

  (it "finds the max product in horizontals"
    (should= 72 (horizontal-max 2 grid3))
    (should= 8051 (horizontal-max 2 problem011/grid))) ; 97 * 83 [14 3] [14 4]

  (it "finds the max product in columns"
    (should= 54 (vertical-max 2 grid3))
    (should= 9215 (vertical-max 2 problem011/grid))) ; 95 * 97 [7 7] [8 7]

  (it "determines if a location is in-bounds of a grid"
    (should= true (in-bounds? grid3 [0 0]))
    (should= true (in-bounds? grid3 [0 2]))
    (should= true (in-bounds? grid3 [2 2]))
    (should= false (in-bounds? grid3 [2 3]))
    (should= false (in-bounds? grid3 [3 2])))

  (it "finds the starting locations "
    (should= [[2 0] [1 0] [0 0] [0 1] [0 2]] (starting-locations grid3)))

  (it "finds the values in the diagonal line for a given starting position"
    (should= [1 5 9] (populate-diagonals [0 0] grid3))
    (should= [2 6] (populate-diagonals [0 1] grid3))
    (should= [3] (populate-diagonals [0 2] grid3))
    (should= [4 8] (populate-diagonals [1 0] grid3))
    (should= [7] (populate-diagonals [2 0] grid3)))

  (it "finds the diagonals [forward & down]"
    (should= [[7] [4 8] [1 5 9] [2 6] [3]]
             (->diagonals grid3))
    (should= [[13] [9 14] [5 10 15] [1 6 11 16] [2 7 12] [3 8] [4]]
             (->diagonals grid4))
    (should= [[3] [1 4] [2]]
             (->diagonals [[1 2] [3 4]])))

  (it "finds the orthogonal diagonals [backward & down]"
    (should= [[1] [2 4] [3 5 7] [6 8] [9]]
             (->ortho-diagonals [[1 2 3] [4 5 6] [7 8 9]])))

  (it "finds the max product in a diagonal"
    (should= 48 (diagonal-max 2 [[1 2 3] [4 5 6] [7 8 9]]))) ; 8*6 = 48 > 9*5 = 45

  (it "Solves #11"
    (should= 72 (euler-11 2 [[1 2 3] [4 5 6] [7 8 9]]))
    (should= 9603 (euler-11 2 problem011/grid)) ;97 * 99, [0 3] [1 2]
    (should= 70600674 (euler-11 4 problem011/grid))))

(run-specs)
