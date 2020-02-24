(ns clj-demo.handler
  (:require [compojure.core :refer :all]))

(defn task-store (atom {}))
(defn ids (atom 0))


(defn next-id
  "Returns next id by "
  []
  (str "id-" @(swap! ids inc)))

(defn add-task
  [task])

(defn remove-tsk
  [task])

(defn get-tasks
  []
  )
