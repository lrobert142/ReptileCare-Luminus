(ns reptile-care.events
  (:require
    [re-frame.core :refer [dispatch reg-event-db reg-sub]]
    [reptile-care.db :as db]))

(reg-event-db
  ::db/initialize-db
  (fn [_ _]
    db/default-db))

(reg-event-db
  ::db/set-active-page
  (fn [db [_ page]]
    (assoc db :page page)))
