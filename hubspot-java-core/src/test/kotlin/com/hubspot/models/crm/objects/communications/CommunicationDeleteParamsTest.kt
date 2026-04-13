// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.communications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunicationDeleteParamsTest {

    @Test
    fun create() {
        CommunicationDeleteParams.builder().communicationId("communicationId").build()
    }

    @Test
    fun pathParams() {
        val params = CommunicationDeleteParams.builder().communicationId("communicationId").build()

        assertThat(params._pathParam(0)).isEqualTo("communicationId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
