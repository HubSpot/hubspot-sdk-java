// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectDeleteParamsTest {

    @Test
    fun create() {
        ProjectDeleteParams.builder().projectId("projectId").build()
    }

    @Test
    fun pathParams() {
        val params = ProjectDeleteParams.builder().projectId("projectId").build()

        assertThat(params._pathParam(0)).isEqualTo("projectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
