@WebServlet("/process")
public class MyServlet extends HttpServlet {

    // GET method
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        response.getWriter().println("GET: " + name);
    }

    // POST method
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        response.getWriter().println("POST: " + name);
    }
}