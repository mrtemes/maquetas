package es.temes.maquetas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

public class MarcoIncidenciasListado {

	private JFrame frmListadoDeIncidencias;
	private JTable tblIncidenciasListado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarcoIncidenciasListado window = new MarcoIncidenciasListado();
					window.frmListadoDeIncidencias.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MarcoIncidenciasListado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListadoDeIncidencias = new JFrame();
		frmListadoDeIncidencias.setTitle("Listado de incidencias");
		frmListadoDeIncidencias.setBounds(100, 100, 580, 300);
		frmListadoDeIncidencias.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListadoDeIncidencias.getContentPane().setLayout(null);
		
		JPanel pnlIncidenciasListado = new JPanel();
		pnlIncidenciasListado.setBounds(0, 0, 564, 261);
		frmListadoDeIncidencias.getContentPane().add(pnlIncidenciasListado);
		pnlIncidenciasListado.setLayout(null);
		
		JScrollPane sclIncidenciasListado = new JScrollPane();
		sclIncidenciasListado.setBounds(0, 0, 564, 261);
		pnlIncidenciasListado.add(sclIncidenciasListado);
		
		tblIncidenciasListado = new JTable();
		tblIncidenciasListado.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Provincia", "Municipio", "Direcci\u00F3n", "CT Matr\u00EDcula", "CT Trafo", "CT Salida BT", "Tipo aver\u00EDa", "Equipo Aver\u00EDas", "New column"
			}
		));
		tblIncidenciasListado.getColumnModel().getColumn(0).setPreferredWidth(130);
		tblIncidenciasListado.getColumnModel().getColumn(1).setPreferredWidth(200);
		tblIncidenciasListado.getColumnModel().getColumn(2).setPreferredWidth(260);
		tblIncidenciasListado.getColumnModel().getColumn(3).setPreferredWidth(190);
		tblIncidenciasListado.getColumnModel().getColumn(4).setPreferredWidth(130);
		tblIncidenciasListado.getColumnModel().getColumn(5).setPreferredWidth(190);
		tblIncidenciasListado.getColumnModel().getColumn(6).setPreferredWidth(130);
		tblIncidenciasListado.getColumnModel().getColumn(7).setPreferredWidth(130);
		sclIncidenciasListado.setViewportView(tblIncidenciasListado);
	}
}
