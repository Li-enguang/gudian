function getStudentList (params) {
  return $axios({
    url: '/student/page',
    method: 'get',
    params
  })
}

// 修改---启用禁用接口
function enableOrDisableStudent (params) {
  return $axios({
    url: '/student',
    method: 'put',
    data: { ...params }
  })
}

// 新增---添加员工
function addStudent (params) {
  return $axios({
    url: '/student',
    method: 'post',
    data: { ...params }
  })
}

// 修改---添加员工
function editStudent (params) {
  return $axios({
    url: '/student',
    method: 'put',
    data: { ...params }
  })
}

// 修改页面反查详情接口
function queryStudentById (id) {
  return $axios({
    url: `/student/${id}`,
    method: 'get'
  })
}

// 删除
function deleteStudent (id) {
  return $axios({
    url: `/student/${id}`,
    method: 'delete',
  })
}