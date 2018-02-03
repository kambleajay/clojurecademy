(ns clojurecademy.exercism.bob
  "Solution for https://clojurecademy.com/course#!/subjects/17592186091322"
  (:require [clojure.string :as str]))

(defn said-nothing?
  [message]
  (empty? (str/trim message)))

(defn no-small-letters?
  [message]
  (empty? (re-seq #"[a-z]" message)))

(defn some-capital-word?
  [message]
  (let [words (str/split message #" ")]
    (some #(re-seq #"^[A-Z]+" %) words)))

(defn yell?
  [message]
  (and
   (no-small-letters? message)
   (some-capital-word? message)))

(defn question?
  [s]
  (str/ends-with? s "?"))

(defn response-for
  [message]
  (cond
    (said-nothing? message) "Fine. Be that way!"
    (yell? message) "Woah, chill out!"
    (question? message) "Sure."
    :else "Whatever."))
