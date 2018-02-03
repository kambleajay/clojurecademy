(ns clojurecademy.exercism.bob
  "Solution for https://clojurecademy.com/course#!/subjects/17592186091322"
  (:require [clojure.string :as str]))

(defn response-for
  [message]
  (let [trimmed-message (str/trim message)]
    (cond
      (empty? trimmed-message) "Fine. Be that way!")))
