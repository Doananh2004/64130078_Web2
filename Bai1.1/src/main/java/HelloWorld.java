// Import các thư viện cần thiết
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloWorld
 */
//Tạo Servlet HelloWord bằng việc kế thừa lớp HttpServlet
@WebServlet("/HelloWorld")  // Anotation cho qui định URL ứng với servlet này
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String message;
	public void init() throws ServletException {
	// Khởi tạo giá trị cho biến
		message = "Hello World";
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Qui định kiểu nội dung đáp ứng
		response.setContentType("text/html");
		// Các xử lý cụ thể ở đây, ví dụ: Lấy về luồng xuất, và gửi trả choỗi về cho client
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

}
