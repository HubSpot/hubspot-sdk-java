// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SequenceGetEnrollmentByContactIdParamsTest {

    @Test
    fun create() {
        SequenceGetEnrollmentByContactIdParams.builder().contactId("contactId").build()
    }

    @Test
    fun pathParams() {
        val params = SequenceGetEnrollmentByContactIdParams.builder().contactId("contactId").build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
