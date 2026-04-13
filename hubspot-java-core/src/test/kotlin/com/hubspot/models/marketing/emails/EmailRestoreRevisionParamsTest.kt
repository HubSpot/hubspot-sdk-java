// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailRestoreRevisionParamsTest {

    @Test
    fun create() {
        EmailRestoreRevisionParams.builder().emailId("emailId").revisionId("revisionId").build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailRestoreRevisionParams.builder().emailId("emailId").revisionId("revisionId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        assertThat(params._pathParam(1)).isEqualTo("revisionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
