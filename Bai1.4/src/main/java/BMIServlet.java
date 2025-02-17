

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMIServlet
 */
@WebServlet("/BMIServlet")
public class BMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Tính chỉ số BMI</h2>");
        out.println("<form action='BMI' method='POST'>");
        out.println("Chiều cao (m): <input type='text' name='height'><br>");
        out.println("Cân nặng (kg): <input type='text' name='weight'><br>");
        out.println("<input type='submit' value='Tính BMI'>");
        out.println("</form>");
        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            double height = Double.parseDouble(request.getParameter("height"));
            double weight = Double.parseDouble(request.getParameter("weight"));
            double bmi = weight / (height * height);
            
            out.println("<html><body>");
            out.println("<h2>Kết quả BMI</h2>");
            out.println("<p>Chiều cao: " + height + " m</p>");
            out.println("<p>Cân nặng: " + weight + " kg</p>");
            out.println("<p>BMI: " + String.format("%.2f", bmi) + "</p>");
            
            String category;
            if (bmi < 18.5) {
                category = "Dưới cân";
            } else if (bmi < 24.9) {
                category = "Bình thường";
            } else if (bmi < 29.9) {
                category = "Thừa cân";
            } else {
                category = "Béo phì";
            }
            out.println("<p>Phân loại: " + category + "</p>");
            out.println("<a href='BMI'>Tính lại</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Vui lòng nhập số hợp lệ!</p>");
            out.println("<a href='BMI'>Quay lại</a>");
        }
	}

}
