// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences.enrollments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrollmentGetByContactIdParamsTest {

    @Test
    fun create() {
        EnrollmentGetByContactIdParams.builder().contactId("contactId").build()
    }

    @Test
    fun pathParams() {
        val params = EnrollmentGetByContactIdParams.builder().contactId("contactId").build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
