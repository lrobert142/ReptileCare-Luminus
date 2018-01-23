(ns reptile-care.routes
  (:require
    [goog.events :as events]
    [goog.history.EventType :as HistoryEventType]
    [re-frame.core :as rf]
    [reptile-care.db :as db]
    [reptile-care.events]
    [reptile-care.subs]
    [secretary.core :as secretary])
  (:import goog.History))

(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
                    (rf/dispatch [::db/set-active-page :home]))

; Browser History Handler
(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
      HistoryEventType/NAVIGATE
      (fn [event]
        (secretary/dispatch! (.-token event))))
    (.setEnabled true)))
