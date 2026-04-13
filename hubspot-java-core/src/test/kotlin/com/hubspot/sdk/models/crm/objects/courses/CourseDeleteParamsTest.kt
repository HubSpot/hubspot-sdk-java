// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.courses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CourseDeleteParamsTest {

    @Test
    fun create() {
        CourseDeleteParams.builder().courseId("courseId").build()
    }

    @Test
    fun pathParams() {
        val params = CourseDeleteParams.builder().courseId("courseId").build()

        assertThat(params._pathParam(0)).isEqualTo("courseId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
