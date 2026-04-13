// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailRestoreRevisionToDraftParamsTest {

    @Test
    fun create() {
        EmailRestoreRevisionToDraftParams.builder().emailId("emailId").revisionId(0L).build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailRestoreRevisionToDraftParams.builder().emailId("emailId").revisionId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
