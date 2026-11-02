# Screen 10: Find & Replace Overlay

> **Extracted Evidence:** `en-US.json` (`guide_find_*`, `find_in_note`, `match_*`)  
> **Presentation Mode:** Compact floating search bar pinned above keyboard  
> **Date:** 2026-11-01  

---

## 1. UI Layout & Component Anatomy

```
┌─────────────────────────────────────────────────────────┐
│  [ 🔍 Find...                 ]  [ 3 of 12 ]  [ ∧ ] [ ∨ ]│
│  [ ✏️ Replace with...          ]  [ Replace ]  [ All ]    │
│  Match Case: [ Aa Off ]                       [ Done ]  │
└─────────────────────────────────────────────────────────┘
```

---

## 2. Interaction Behaviors

* **Trigger:** Tapping `•••` header menu in note editor -> *"Find in Note"*.
* **Live Highlighting:**
  * As the user types in the search field, matching words throughout the `appflowy_editor` document instantly highlight in yellow.
  * Active focused match highlights in bright orange.
* **Match Stepping:**
  * Chevron buttons `[ ∧ ]` and `[ ∨ ]` automatically scroll the editor viewport to bring the previous/next match into view.
  * Counter updates in real-time (e.g. *"1 of 4"*, *"No matches"*).
* **Replacement:**
  * **Replace:** Replaces the currently focused match with replacement string and moves to next match.
  * **All:** Performs atomic batch replacement across entire note in <1ms with a confirmation toast.

