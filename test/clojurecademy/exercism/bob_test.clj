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

(deftest test-bob-says-whoa-chill-out-for-yells
  (are [message]
      (= "Woah, chill out!" (response-for message))
    "WATCH OUT!"
    "WHAT THE HELL WERE YOU THINKING?"
    "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!"
    "1, 2, 3 GO!"
    "I HATE YOU"))

(deftest test-bob-says-whatever-to-anything-else
  (are [message]
      (= "Whatever." (response-for message))
    "Tom-ay-to, tom-aaaah-to."
    "Let's go make out behind the gym!"
    "It's OK if you don't want to go to the DMV."
    "Ending with ? means a question."
    "1, 2, 3"))
