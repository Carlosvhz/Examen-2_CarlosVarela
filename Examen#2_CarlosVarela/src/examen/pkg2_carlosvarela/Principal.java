package examen.pkg2_carlosvarela;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    Usuario usuarioActivado = null;
    ArrayList<Usuario> Usuarios = new ArrayList();
    ArrayList<Album> albumes = new ArrayList();
    ArrayList<Cancion> canciones = new ArrayList();
    Cancion cancionañadir;
    Administrador administrador = new Administrador();
    
    public Principal() {
        initComponents();
        administrador.setAlbumes(albumes);
        administrador.setUsuarios(Usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Usuarios = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_eliminarUsuarios = new javax.swing.JList<>();
        bt_Eliminarusuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_listarUsuarios = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        sp_edad = new javax.swing.JSpinner();
        tf_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        bt_agregarUsuario = new javax.swing.JButton();
        jd_LogIn = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        tf_userNameLogIn = new javax.swing.JTextField();
        pf_contraseñaLogIn = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_LogIn = new javax.swing.JButton();
        jd_crearCancion = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_nombreCancion = new javax.swing.JTextField();
        tf_artistaCancion = new javax.swing.JTextField();
        sp_duracionCancion = new javax.swing.JSpinner();
        cb_genero = new javax.swing.JComboBox<>();
        cb_albumCancion = new javax.swing.JComboBox<>();
        bt_guardarCancion = new javax.swing.JButton();
        jd_albumes = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_listarAlbumes = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_eliminarAlbum = new javax.swing.JList<>();
        bt_eliminarAlbum = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_nombreAlbum = new javax.swing.JTextField();
        tf_artistaAlbum = new javax.swing.JTextField();
        bt_agregarAlbum = new javax.swing.JButton();
        jd_SubMenu = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lb_explorar = new javax.swing.JLabel();
        lb_CrearPlayList = new javax.swing.JLabel();
        lb_verPlayList = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jd_explorar = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_cancionesdelAlbum = new javax.swing.JList<>();
        cb_albumes = new javax.swing.JComboBox<>();
        ppm_playlistFavoritos = new javax.swing.JPopupMenu();
        mi_playList = new javax.swing.JMenuItem();
        mi_Favoritos = new javax.swing.JMenuItem();
        jd_añadirPlayListCancion = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        cb_playList = new javax.swing.JComboBox<>();
        bt_añadirCancionaPlaylist = new javax.swing.JButton();
        jd_añadirPlayList = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_nombrePlayList = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_añadirCanciones = new javax.swing.JList<>();
        bt_añadirCancionPlayList = new javax.swing.JButton();
        bt_añadirPlayList = new javax.swing.JButton();
        jd_verPlayList = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtree_playList = new javax.swing.JTree();
        ppm_Eliminar = new javax.swing.JPopupMenu();
        mi_eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_usuarios = new javax.swing.JLabel();
        lb_canciones = new javax.swing.JLabel();
        lb_cargarUsuarios = new javax.swing.JLabel();
        lb_albums = new javax.swing.JLabel();
        lb_LogIn = new javax.swing.JLabel();
        lb_gardarUsuarios = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));

        jl_eliminarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jl_eliminarUsuarios);

        bt_Eliminarusuario.setText("Eliminar");
        bt_Eliminarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EliminarusuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Eliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Eliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel4);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jl_listarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jl_listarUsuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel3);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edad:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UserName:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password:");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        bt_agregarUsuario.setText("Agregar Usuario");
        bt_agregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_agregarUsuario)
                .addGap(112, 112, 112))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(bt_agregarUsuario)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel6);

        javax.swing.GroupLayout jd_UsuariosLayout = new javax.swing.GroupLayout(jd_Usuarios.getContentPane());
        jd_Usuarios.getContentPane().setLayout(jd_UsuariosLayout);
        jd_UsuariosLayout.setHorizontalGroup(
            jd_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_UsuariosLayout.setVerticalGroup(
            jd_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("UserName:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Contraseña:");

        bt_LogIn.setText("LogIn");
        bt_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf_contraseñaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(bt_LogIn)
                                .addGap(92, 92, 92))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(tf_userNameLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_userNameLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_contraseñaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addComponent(bt_LogIn)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_LogInLayout = new javax.swing.GroupLayout(jd_LogIn.getContentPane());
        jd_LogIn.getContentPane().setLayout(jd_LogInLayout);
        jd_LogInLayout.setHorizontalGroup(
            jd_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_LogInLayout.setVerticalGroup(
            jd_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duración:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Artista:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Genero:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Album:");

        sp_duracionCancion.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rock", "Pop", "Rap", "Salsa", "Reggue", "Clasicas" }));

        bt_guardarCancion.setText("Guardar Cancion");
        bt_guardarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardarCancionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_guardarCancion)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_artistaCancion, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(tf_nombreCancion)
                        .addComponent(sp_duracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cb_albumCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_artistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sp_duracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_albumCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_guardarCancion)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearCancionLayout = new javax.swing.GroupLayout(jd_crearCancion.getContentPane());
        jd_crearCancion.getContentPane().setLayout(jd_crearCancionLayout);
        jd_crearCancionLayout.setHorizontalGroup(
            jd_crearCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearCancionLayout.setVerticalGroup(
            jd_crearCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        jl_listarAlbumes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jl_listarAlbumes);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listar", jPanel8);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jl_eliminarAlbum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jl_eliminarAlbum);

        bt_eliminarAlbum.setText("Eliminar");
        bt_eliminarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(bt_eliminarAlbum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_eliminarAlbum)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Eliminar", jPanel10);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Artista:");

        bt_agregarAlbum.setText("Agregar Album");
        bt_agregarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(tf_artistaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nombreAlbum)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_agregarAlbum)
                .addGap(161, 161, 161))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_artistaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(bt_agregarAlbum)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar", jPanel9);

        javax.swing.GroupLayout jd_albumesLayout = new javax.swing.GroupLayout(jd_albumes.getContentPane());
        jd_albumes.getContentPane().setLayout(jd_albumesLayout);
        jd_albumesLayout.setHorizontalGroup(
            jd_albumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jd_albumesLayout.setVerticalGroup(
            jd_albumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_explorar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_explorar.setText("Explorar");
        lb_explorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_explorarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_explorarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_explorarMouseExited(evt);
            }
        });

        lb_CrearPlayList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_CrearPlayList.setText("Crear PlayList");
        lb_CrearPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CrearPlayListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_CrearPlayListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_CrearPlayListMouseExited(evt);
            }
        });

        lb_verPlayList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_verPlayList.setText("Ver PlayList");
        lb_verPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_verPlayListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_verPlayListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_verPlayListMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("jLabel16");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("jLabel16");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_CrearPlayList)
                    .addComponent(lb_explorar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_verPlayList, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lb_explorar)
                .addGap(18, 18, 18)
                .addComponent(lb_CrearPlayList)
                .addGap(18, 18, 18)
                .addComponent(lb_verPlayList)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jd_SubMenuLayout = new javax.swing.GroupLayout(jd_SubMenu.getContentPane());
        jd_SubMenu.getContentPane().setLayout(jd_SubMenuLayout);
        jd_SubMenuLayout.setHorizontalGroup(
            jd_SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_SubMenuLayout.setVerticalGroup(
            jd_SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Elija album:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Lista de canciones del album:");

        jl_cancionesdelAlbum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_cancionesdelAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cancionesdelAlbumMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_cancionesdelAlbum);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_albumes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_albumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jd_explorarLayout = new javax.swing.GroupLayout(jd_explorar.getContentPane());
        jd_explorar.getContentPane().setLayout(jd_explorarLayout);
        jd_explorarLayout.setHorizontalGroup(
            jd_explorarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_explorarLayout.setVerticalGroup(
            jd_explorarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mi_playList.setText("Añadir a un playlist");
        mi_playList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_playListActionPerformed(evt);
            }
        });
        ppm_playlistFavoritos.add(mi_playList);

        mi_Favoritos.setText("Añadir a favoritos");
        mi_Favoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_FavoritosActionPerformed(evt);
            }
        });
        ppm_playlistFavoritos.add(mi_Favoritos);

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Seleccione playList:");

        bt_añadirCancionaPlaylist.setText("Añadir");
        bt_añadirCancionaPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirCancionaPlaylistMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_añadirCancionaPlaylist)
                    .addComponent(cb_playList, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cb_playList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_añadirCancionaPlaylist)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_añadirPlayListCancionLayout = new javax.swing.GroupLayout(jd_añadirPlayListCancion.getContentPane());
        jd_añadirPlayListCancion.getContentPane().setLayout(jd_añadirPlayListCancionLayout);
        jd_añadirPlayListCancionLayout.setHorizontalGroup(
            jd_añadirPlayListCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_añadirPlayListCancionLayout.setVerticalGroup(
            jd_añadirPlayListCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nombre:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Seleccione las canciones:");

        jl_añadirCanciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane6.setViewportView(jl_añadirCanciones);

        bt_añadirCancionPlayList.setText("Añadir");
        bt_añadirCancionPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirCancionPlayListMouseClicked(evt);
            }
        });

        bt_añadirPlayList.setText("Añadir playList");
        bt_añadirPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirPlayListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(bt_añadirPlayList))
                            .addComponent(jLabel23)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nombrePlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(bt_añadirCancionPlayList)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_nombrePlayList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(bt_añadirPlayList)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_añadirCancionPlayList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_añadirPlayListLayout = new javax.swing.GroupLayout(jd_añadirPlayList.getContentPane());
        jd_añadirPlayList.getContentPane().setLayout(jd_añadirPlayListLayout);
        jd_añadirPlayListLayout.setHorizontalGroup(
            jd_añadirPlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_añadirPlayListLayout.setVerticalGroup(
            jd_añadirPlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_añadirPlayListLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jtree_playList.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_playList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_playListMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jtree_playList);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_verPlayListLayout = new javax.swing.GroupLayout(jd_verPlayList.getContentPane());
        jd_verPlayList.getContentPane().setLayout(jd_verPlayListLayout);
        jd_verPlayListLayout.setHorizontalGroup(
            jd_verPlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_verPlayListLayout.setVerticalGroup(
            jd_verPlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mi_eliminar.setText("Eliminar");
        mi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarActionPerformed(evt);
            }
        });
        ppm_Eliminar.add(mi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_usuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuarios.setText("Usuarios");
        lb_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_usuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_usuariosMouseExited(evt);
            }
        });

        lb_canciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_canciones.setForeground(new java.awt.Color(255, 255, 255));
        lb_canciones.setText("Canciones");
        lb_canciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cancionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cancionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cancionesMouseExited(evt);
            }
        });

        lb_cargarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_cargarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lb_cargarUsuarios.setText("Cargar Usuarios");
        lb_cargarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cargarUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cargarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cargarUsuariosMouseExited(evt);
            }
        });

        lb_albums.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_albums.setForeground(new java.awt.Color(255, 255, 255));
        lb_albums.setText("Albums");
        lb_albums.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_albumsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_albumsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_albumsMouseExited(evt);
            }
        });

        lb_LogIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_LogIn.setForeground(new java.awt.Color(255, 255, 255));
        lb_LogIn.setText("LogIn");
        lb_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_LogInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_LogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_LogInMouseExited(evt);
            }
        });

        lb_gardarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_gardarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lb_gardarUsuarios.setText("Guardar Usuarios");
        lb_gardarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_gardarUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_gardarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_gardarUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_canciones, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cargarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_albums, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_gardarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(lb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_canciones)
                .addGap(18, 18, 18)
                .addComponent(lb_albums, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_gardarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_cargarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_usuariosMouseEntered
        lb_usuarios.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_usuariosMouseEntered

    private void lb_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_usuariosMouseExited
       lb_usuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_usuariosMouseExited

    private void lb_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_usuariosMouseClicked
        recargarListasUsuario();
        jd_Usuarios.pack();
        jd_Usuarios.setModal(true);
        jd_Usuarios.setLocationRelativeTo(null);
        jd_Usuarios.setVisible(true);
    }//GEN-LAST:event_lb_usuariosMouseClicked

    
    
    private void lb_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_LogInMouseClicked
        if (usuarioActivado==null) {
            jd_LogIn.pack();
            jd_LogIn.setModal(true);
            jd_LogIn.setLocationRelativeTo(null);
            jd_LogIn.setVisible(true);
        }
    }//GEN-LAST:event_lb_LogInMouseClicked

    private void lb_LogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_LogInMouseEntered
        lb_LogIn.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_LogInMouseEntered

    private void lb_LogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_LogInMouseExited
        lb_LogIn.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_LogInMouseExited

    private void bt_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LogInMouseClicked
        try {
            usuarioActivado = verificarCuenta(tf_userNameLogIn.getText(), pf_contraseñaLogIn.getText());
            if (usuarioActivado!=null) {
                JOptionPane.showMessageDialog(jd_LogIn, "Bienvenido "+usuarioActivado.getNombre());
                
                tf_userNameLogIn.setText("");
                pf_contraseñaLogIn.setText("");
                jd_LogIn.dispose();
                
                
            }else{
                JOptionPane.showMessageDialog(jd_LogIn, "Username o contraseña incorrectas");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_LogInMouseClicked

    
    
    private void bt_agregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarUsuarioMouseClicked
        try {
            if (tf_nombre.getText().equals("")||tf_username.getText().equals("")||pf_password.getText().equals("")
                ||(int)sp_edad.getValue()==0) {
                JOptionPane.showMessageDialog(jd_Usuarios, "Ingrese todos los requisitos");
            }else{
                Usuarios.add(new Usuario(tf_nombre.getText(),tf_username.getText(),pf_password.getText(), (int)sp_edad.getValue()));
                JOptionPane.showMessageDialog(jd_Usuarios, "Usuario ingresado");
                
                tf_nombre.setText("");
                tf_username.setText("");
                pf_password.setText("");
                sp_edad.setValue(0);
                recargarListasUsuario();
            }
        } catch (Exception e) {
            System.out.println("Sucedio un problema");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_agregarUsuarioMouseClicked

    
    
    private void lb_cancionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cancionesMouseEntered
        lb_canciones.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_cancionesMouseEntered

    private void lb_cancionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cancionesMouseExited
        lb_canciones.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_cancionesMouseExited

    private void lb_cancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cancionesMouseClicked
        if (usuarioActivado!=null) {
            if (albumes.size()>0) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                for (Album album : albumes) {
                    modelo.addElement(album);
                }
                cb_albumCancion.setModel(modelo);
                
                tf_nombreCancion.setText("");
                tf_artistaCancion.setText("");
                cb_genero.setSelectedIndex(0);
                sp_duracionCancion.setValue(0);
                jd_crearCancion.pack();
                jd_crearCancion.setModal(true);
                jd_crearCancion.setLocationRelativeTo(null);
                jd_crearCancion.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "No hay suficientes albumes");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Inicie sesion");
        }
    }//GEN-LAST:event_lb_cancionesMouseClicked

    private void bt_guardarCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardarCancionMouseClicked
        try {
            Album album = (Album)cb_albumCancion.getSelectedItem();
            album.añadirCancion(new Cancion(tf_nombreCancion.getText(),tf_artistaCancion.getText(), ""+cb_genero.getSelectedItem(),(int)sp_duracionCancion.getValue()));
            JOptionPane.showConfirmDialog(jd_crearCancion, "Cancion agregada");
            tf_nombreCancion.setText("");
            tf_artistaCancion.setText("");
            cb_genero.setSelectedIndex(0);
            sp_duracionCancion.setValue(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_guardarCancionMouseClicked

    
    
    
    private void lb_albumsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_albumsMouseEntered
        lb_albums.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_albumsMouseEntered

    private void lb_albumsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_albumsMouseExited
        lb_albums.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_albumsMouseExited

    private void lb_albumsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_albumsMouseClicked
        if (usuarioActivado!=null) {
            recargarListasAlbum();
            jd_albumes.pack();
            jd_albumes.setModal(true);
            jd_albumes.setLocationRelativeTo(null);
            jd_albumes.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Inicie sesion");
        }
    }//GEN-LAST:event_lb_albumsMouseClicked

    private void bt_agregarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarAlbumMouseClicked
        if (tf_nombreAlbum.getText().equals("")||tf_artistaAlbum.getText().equals("")) {
            JOptionPane.showMessageDialog(jd_albumes, "Llene los requisitos");
        }else{
            albumes.add(new Album(tf_nombreAlbum.getText(), tf_artistaAlbum.getText()));
            JOptionPane.showMessageDialog(jd_albumes, "Album agregado");
            recargarListasAlbum();
            tf_nombreAlbum.setText("");
            tf_artistaAlbum.setText("");
        }
    }//GEN-LAST:event_bt_agregarAlbumMouseClicked

    private void bt_eliminarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarAlbumMouseClicked
        if (jl_eliminarAlbum.getSelectedIndex()>-1) {
            try {
                DefaultListModel modelo = (DefaultListModel)jl_eliminarAlbum.getModel();
                Album eliminarAlbum = (Album)modelo.getElementAt(jl_eliminarAlbum.getSelectedIndex());
                albumes.remove(eliminarAlbum);
                JOptionPane.showMessageDialog(jd_albumes, "Album eliminado");
                recargarListasAlbum();
            } catch (Exception e) {
                System.out.println("Error al eliminar album");
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(jd_albumes, "Seleccione un elemento");
        }
    }//GEN-LAST:event_bt_eliminarAlbumMouseClicked

    
    
    ////SubMenu
    
    //Explorar
    private void lb_explorarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_explorarMouseEntered
        lb_explorar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_explorarMouseEntered

    private void lb_explorarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_explorarMouseExited
        lb_explorar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_explorarMouseExited

    private void lb_explorarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_explorarMouseClicked
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Album album : albumes) {
            modelo.addElement(album);
        }
        cb_albumes.setModel(modelo);
        jd_explorar.pack();
        jd_explorar.setModal(true);
        jd_explorar.setLocationRelativeTo(null);
        jd_explorar.setVisible(true);
    }//GEN-LAST:event_lb_explorarMouseClicked

    private void jl_cancionesdelAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cancionesdelAlbumMouseClicked
        if (evt.isMetaDown()) {
            if (jl_cancionesdelAlbum.getSelectedIndex()>0) {
                try {
                    ppm_playlistFavoritos.show(jl_cancionesdelAlbum,evt.getX(),evt.getY());
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jl_cancionesdelAlbumMouseClicked

    private void mi_playListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_playListActionPerformed
        try {
            if (usuarioActivado.getPlayLists().size()>0) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                for (PlayList playList : usuarioActivado.getPlayLists()) {
                    modelo.addElement(playList);
                }
                cb_playList.setModel(modelo);
                
                jd_añadirPlayListCancion.pack();
                jd_añadirPlayListCancion.setModal(true);
                jd_añadirPlayListCancion.setLocationRelativeTo(null);
                jd_añadirPlayListCancion.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(jd_explorar, "No hay playList para ingresar a uno");
            }
        } catch (Exception e) {
            System.out.println("Problema en agregar a playlist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_mi_playListActionPerformed

    private void mi_FavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_FavoritosActionPerformed
        try {
            boolean añadir = true;
            DefaultListModel modelo = (DefaultListModel)jl_cancionesdelAlbum.getModel();
            Cancion cancionSeleccionada = (Cancion)modelo.getElementAt(jl_cancionesdelAlbum.getSelectedIndex());
            for (Cancion favorito : usuarioActivado.getFavoritos()) {
                if (cancionSeleccionada.equals(favorito)) {
                    añadir = false;
                }
            }
            if (añadir) {
                usuarioActivado.añadirFavorito(cancionSeleccionada);
                JOptionPane.showMessageDialog(jd_explorar, "Cancion añadida a favoritos");
            }else{
                JOptionPane.showMessageDialog(jd_explorar, "Cancion ya seleccionada en favoritos");
            }
        } catch (Exception e) {
            System.out.println("Error al guardar en favoritos");
            e.printStackTrace();
        }
    }//GEN-LAST:event_mi_FavoritosActionPerformed

    
    
    
    private void bt_añadirCancionaPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirCancionaPlaylistMouseClicked
        try {
            DefaultComboBoxModel modelo  = (DefaultComboBoxModel)cb_playList.getModel();
            DefaultListModel modeloLista = (DefaultListModel)jl_cancionesdelAlbum.getModel();
            Cancion cancion = (Cancion)modeloLista.getElementAt(jl_cancionesdelAlbum.getSelectedIndex());
            PlayList playList = (PlayList)modelo.getSelectedItem();
            playList.añadirCancion(cancion);
            
            JOptionPane.showMessageDialog(jd_añadirPlayListCancion, "Cancion añadida");
            cb_playList.setSelectedIndex(0);
            jd_añadirPlayListCancion.dispose();
        } catch (Exception e) {
            System.out.println("Error al agregar cancion al playlist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_añadirCancionaPlaylistMouseClicked

    
    
    
    
    //Añadir playlist
    private void lb_CrearPlayListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CrearPlayListMouseEntered
        lb_CrearPlayList.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_CrearPlayListMouseEntered

    private void lb_CrearPlayListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CrearPlayListMouseExited
        lb_CrearPlayList.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_CrearPlayListMouseExited

    private void lb_CrearPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CrearPlayListMouseClicked
        cancionañadir = null;
        canciones = new ArrayList();
        
        jd_añadirPlayList.pack();
        jd_añadirPlayList.setModal(true);
        jd_añadirPlayList.setLocationRelativeTo(null);
        jd_añadirPlayList.setVisible(true);
    }//GEN-LAST:event_lb_CrearPlayListMouseClicked

    private void bt_añadirCancionPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirCancionPlayListMouseClicked
        if (jl_añadirCanciones.getSelectedIndex()>-1) {
            DefaultListModel modelo = (DefaultListModel)jl_añadirCanciones.getModel();
            cancionañadir = (Cancion)modelo.getElementAt(jl_añadirCanciones.getSelectedIndex());
            canciones.add(cancionañadir);
        }else{
            JOptionPane.showMessageDialog(jd_añadirPlayList, "Seleccione una cancion");
        }
    }//GEN-LAST:event_bt_añadirCancionPlayListMouseClicked

    private void bt_añadirPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirPlayListMouseClicked
        try {
            if (tf_nombrePlayList.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_añadirPlayList, "Ingrese un nombre");
            }else{
                usuarioActivado.añadirPlayList(new PlayList(tf_nombrePlayList.getText(), canciones));
                JOptionPane.showMessageDialog(jd_añadirPlayList, "PlayList añadido");
                tf_nombrePlayList.setText("");
                canciones = new ArrayList();
            }
        } catch (Exception e) {
            System.out.println("Error al agregar nuevo PlayList");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_añadirPlayListMouseClicked

    
    
    //Ver PlayList
    private void lb_verPlayListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_verPlayListMouseEntered
        lb_verPlayList.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_verPlayListMouseEntered

    private void lb_verPlayListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_verPlayListMouseExited
        lb_verPlayList.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_verPlayListMouseExited

    private void lb_verPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_verPlayListMouseClicked
        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode("Mis PlayList");
        DefaultTreeModel modelo = new DefaultTreeModel(nodoRaiz);
        DefaultMutableTreeNode nodohijo;
        DefaultMutableTreeNode nodoHijodelHijo;
        for (PlayList playList : usuarioActivado.getPlayLists()) {
            nodohijo = new DefaultMutableTreeNode(playList);
            for (Cancion cancion : playList.getCanciones()) {
                nodoHijodelHijo = new DefaultMutableTreeNode(cancion);
                nodohijo.add(nodoHijodelHijo);
            }
            nodoRaiz.add(nodohijo);
        }
        modelo.setRoot(nodoRaiz);
        jtree_playList.setModel(modelo);
        jd_verPlayList.pack();
        jd_verPlayList.setModal(true);
        jd_verPlayList.setLocationRelativeTo(null);
        jd_verPlayList.setVisible(true);
    }//GEN-LAST:event_lb_verPlayListMouseClicked

    private void jtree_playListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_playListMouseClicked
        if (evt.isMetaDown()) {
            try {
                DefaultTreeModel modelo = (DefaultTreeModel)jtree_playList.getModel();
                Object objeto = jtree_playList.getSelectionPath().getLastPathComponent();
                if (objeto instanceof Cancion) {
                    ppm_Eliminar.show(jtree_playList, evt.getX(), evt.getY());
                }
            } catch (Exception e) {
                System.out.println("Error al obtener nodo en Jtree de vista de playList");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jtree_playListMouseClicked

    private void mi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarActionPerformed
        try {
            DefaultTreeModel modelo = (DefaultTreeModel)jtree_playList.getModel();
            Object objeto = jtree_playList.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode n = (DefaultMutableTreeNode)objeto;
            n.removeFromParent();
            modelo.reload();
        } catch (Exception e) {
            System.out.println("Error al eliminar objeto en Jtree de vista de playList");
            e.printStackTrace();
        }
    }//GEN-LAST:event_mi_eliminarActionPerformed

    
    
    //Eliminar usuarios
    private void bt_EliminarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EliminarusuarioMouseClicked
        if (jl_eliminarUsuarios.getSelectedIndex()>-1) {
            DefaultListModel modelo = (DefaultListModel)jl_eliminarUsuarios.getModel();
            Usuario eliminar = (Usuario)modelo.getElementAt(jl_eliminarUsuarios.getSelectedIndex());
            Usuarios.remove(eliminar);
            JOptionPane.showMessageDialog(jd_Usuarios, "Usuario eliminado");
            recargarListasUsuario();
        }else{
            JOptionPane.showMessageDialog(jd_Usuarios, "Escoga un usuario");
        }
    }//GEN-LAST:event_bt_EliminarusuarioMouseClicked

    
    //Guardar
    private void lb_gardarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_gardarUsuariosMouseEntered
        lb_gardarUsuarios.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_gardarUsuariosMouseEntered

    private void lb_gardarUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_gardarUsuariosMouseExited
        lb_gardarUsuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_gardarUsuariosMouseExited

    private void lb_gardarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_gardarUsuariosMouseClicked
        Administrador adm = new Administrador();
        adm.setAlbumes(albumes);
        adm.setUsuarios(Usuarios);
        adm.Escribir();
    }//GEN-LAST:event_lb_gardarUsuariosMouseClicked

    
    //Cargar
    private void lb_cargarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cargarUsuariosMouseEntered
        lb_cargarUsuarios.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_cargarUsuariosMouseEntered

    private void lb_cargarUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cargarUsuariosMouseExited
        lb_cargarUsuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_cargarUsuariosMouseExited

    private void lb_cargarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cargarUsuariosMouseClicked
        try {
            Administrador admin;
            admin = administrador.Cargar();
            this.Usuarios = admin.getUsuarios();
            this.albumes = admin.getAlbumes();
            JOptionPane.showMessageDialog(this, "Archivos cargados");
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo en el main");
            e.printStackTrace();
        }
    }//GEN-LAST:event_lb_cargarUsuariosMouseClicked

    

    public void recargarListasUsuario(){
        DefaultListModel modeloListaEliminar = new DefaultListModel();
        DefaultListModel modeloListaListar = new DefaultListModel();
        for (Usuario Usuario : Usuarios) {
            modeloListaEliminar.addElement(Usuario);
            modeloListaListar.addElement(Usuario);
        }
        jl_listarUsuarios.setModel(modeloListaListar);
        jl_eliminarUsuarios.setModel(modeloListaEliminar);
    }
    
    public void recargarListasAlbum(){
        DefaultListModel modelo = new DefaultListModel();
        for (Album album : albumes) {
            modelo.addElement(album);
        }
        jl_listarAlbumes.setModel(modelo);
        jl_eliminarAlbum.setModel(modelo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    public Usuario verificarCuenta(String username, String password){
        for (Usuario u : Usuarios) {
            if (u.getUsername().equals(username)&&u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Eliminarusuario;
    private javax.swing.JButton bt_LogIn;
    private javax.swing.JButton bt_agregarAlbum;
    private javax.swing.JButton bt_agregarUsuario;
    private javax.swing.JButton bt_añadirCancionPlayList;
    private javax.swing.JButton bt_añadirCancionaPlaylist;
    private javax.swing.JButton bt_añadirPlayList;
    private javax.swing.JButton bt_eliminarAlbum;
    private javax.swing.JButton bt_guardarCancion;
    private javax.swing.JComboBox<String> cb_albumCancion;
    private javax.swing.JComboBox<String> cb_albumes;
    private javax.swing.JComboBox<String> cb_genero;
    private javax.swing.JComboBox<String> cb_playList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_LogIn;
    private javax.swing.JDialog jd_SubMenu;
    private javax.swing.JDialog jd_Usuarios;
    private javax.swing.JDialog jd_albumes;
    private javax.swing.JDialog jd_añadirPlayList;
    private javax.swing.JDialog jd_añadirPlayListCancion;
    private javax.swing.JDialog jd_crearCancion;
    private javax.swing.JDialog jd_explorar;
    private javax.swing.JDialog jd_verPlayList;
    private javax.swing.JList<String> jl_añadirCanciones;
    private javax.swing.JList<String> jl_cancionesdelAlbum;
    private javax.swing.JList<String> jl_eliminarAlbum;
    private javax.swing.JList<String> jl_eliminarUsuarios;
    private javax.swing.JList<String> jl_listarAlbumes;
    private javax.swing.JList<String> jl_listarUsuarios;
    private javax.swing.JTree jtree_playList;
    private javax.swing.JLabel lb_CrearPlayList;
    private javax.swing.JLabel lb_LogIn;
    private javax.swing.JLabel lb_albums;
    private javax.swing.JLabel lb_canciones;
    private javax.swing.JLabel lb_cargarUsuarios;
    private javax.swing.JLabel lb_explorar;
    private javax.swing.JLabel lb_gardarUsuarios;
    private javax.swing.JLabel lb_usuarios;
    private javax.swing.JLabel lb_verPlayList;
    private javax.swing.JMenuItem mi_Favoritos;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_playList;
    private javax.swing.JPasswordField pf_contraseñaLogIn;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPopupMenu ppm_Eliminar;
    private javax.swing.JPopupMenu ppm_playlistFavoritos;
    private javax.swing.JSpinner sp_duracionCancion;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField tf_artistaAlbum;
    private javax.swing.JTextField tf_artistaCancion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreAlbum;
    private javax.swing.JTextField tf_nombreCancion;
    private javax.swing.JTextField tf_nombrePlayList;
    private javax.swing.JTextField tf_userNameLogIn;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
