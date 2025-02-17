

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMeServlet
 */
@WebServlet("/AboutMeServlet")
public class AboutMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Thiết lập loại nội dung là HTML
        response.setContentType("text/html;charset=UTF-8");
        
        // Lấy đối tượng PrintWriter để ghi phản hồi
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<html>");
            out.println("<head><title>About Me</title></head>");
            out.println("<body>");
            out.println("<h2>Thông tin cá nhân</h2>");
            out.println("<p><strong>Họ và tên:</strong> Trần Doãn Anh</p>");
            out.println("<p><strong>Ngày sinh:</strong> 09/11/2004</p>");
            out.println("<p><strong>Email:</strong> trandoananhnt@gmail.com</p>");
            out.println("<p><strong>Sở thích:</strong> Lập trình, đọc sách, chơi thể thao</p>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
	}

}
