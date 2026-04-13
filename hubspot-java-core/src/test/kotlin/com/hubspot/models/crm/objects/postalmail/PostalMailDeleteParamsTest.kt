// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.postalmail

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostalMailDeleteParamsTest {

    @Test
    fun create() {
        PostalMailDeleteParams.builder().postalMailId("postalMailId").build()
    }

    @Test
    fun pathParams() {
        val params = PostalMailDeleteParams.builder().postalMailId("postalMailId").build()

        assertThat(params._pathParam(0)).isEqualTo("postalMailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
