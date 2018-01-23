(ns home.core
  (:require
    [home.db :as db]
    [home.events]
    [home.subs]
    [home.views :as views]))

(defn view
  "Container for home page"
  []
  [:div.container
   [views/view]])
