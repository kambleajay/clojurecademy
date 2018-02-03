(ns clojurecademy.exercism.bob-test
  (:require [clojure.test :refer :all]
            [clojurecademy.exercism.bob :refer :all]))

(deftest test-bob-says-fine-for-empty-message
  (are [message]
      (= "Fine. Be that way!" (response-for message))
    ""
    " "))

(deftest test-bob-says-sure-for-question
  (are [message]
      (= "Sure." (response-for message))
    "Does this cryogenic chamber make me look fat?"
    "4?"))
