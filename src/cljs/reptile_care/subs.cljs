(ns reptile-care.subs
  (:require
    [re-frame.core :refer [dispatch reg-event-db reg-sub]]
    [reptile-care.db :as db]))

(reg-sub
  ::db/page
  (fn [db _]
    (:page db)))
