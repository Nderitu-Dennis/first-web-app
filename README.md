# All about servlets
## SESSIONS IN HTTP 
**request.getSession():** This retrieves the existing session associated with the request or creates a new one if no session exists.

**request.getSession(true):** This explicitly creates a new session if one does not already exist.

**request.getSession(false):** This retrieves the existing session or returns null if no session is currently associated with the request.

## SERVLET CONFIG & SERVLET CONTEXT
-used to get initial values of a servlet/application-e.g. a filepath
-done in the dd

**ServletConfig**-works in individual servlets-diff configs for different servlets hence the name ServletConfig
-declared in an individual servlet tag in the dd

**ServletContext**-shared by all servlets, one context visible/used by all servlets

---

# JSP -Java Server Pages
- write `Java` code inside `HTML`
