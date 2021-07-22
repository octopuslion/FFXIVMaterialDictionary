import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class UIBuilder {
  public static JFrame build() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception ignored) {
    }

    JFrame frame = new JFrame("FrameDemo");
    JButton button = new JButton();
    Container container = frame.getContentPane();

    button.setText("Demo");
    button.setPreferredSize(new Dimension(100, 100));
    container.add(button, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(175, 100));
    frame.setLocationRelativeTo(null);
    frame.pack();
    return frame;
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
        () -> {
          JFrame mainFrame = build();
          mainFrame.setVisible(true);
        });
  }
}
