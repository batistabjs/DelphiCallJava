<template>
  <v-container>
    <v-responsive class="d-flex align-center text-center fill-height">
      <v-table fixed-header height="270px">
        <thead class="text-left">
          <tr>
            <th>Código</th>
            <th>Matrícula</th>
            <th>Razão Social</th>
            <th>CPF/CNPJ</th>
            <th>Grupo</th>
          </tr>
        </thead>
        <tbody>
          <tr
            v-for="(coop, index) in cooperados"
            :key="index"
            class="text-left"
          >
            <td>{{ coop.codigo }}</td>
            <td>{{ coop.matricula }}</td>
            <td>{{ coop.razaoSocial }}</td>
            <td>{{ coop.cpfCnpj }}</td>
            <td>{{ coop.grupo }}</td>
          </tr>
        </tbody>
      </v-table>

      <v-progress-linear
        :active="true"
        :indeterminate="true"
        absolute
        bottom
        color="teal-darken-3"
        height="1"
      ></v-progress-linear>
    </v-responsive>
  </v-container>
</template>

<script>
import { checkOnline, buscarCoops } from "../api/coop-backend";

export default {
  data() {
    return {
      isOnline: false,
      cooperados: [],
    };
  },
  mounted() {
    this.checkOnline();
    this.buscarCoops();
  },
  computed: {
    this.checkOnline();
    this.buscarCoops();
  },
  methods: {
    async checkOnline() {
      await checkOnline
        .get()
        .then((response) => {
          this.isOline = true;
        })
        .catch(function (error) {
          if (error.response) {
            this.isOline = false;
            console.log(error.response.status);
          }
        });
    },
    async buscarCoops() {
      await buscarCoops
        .get()
        .then((response) => {
          this.cooperados = Object.assign([], response.data);
        })
        .catch(function (error) {
          if (error.response) {
            this.cooperados = null;
            console.log(error.response.status);
          }
        });
    },
  },
};
</script>
