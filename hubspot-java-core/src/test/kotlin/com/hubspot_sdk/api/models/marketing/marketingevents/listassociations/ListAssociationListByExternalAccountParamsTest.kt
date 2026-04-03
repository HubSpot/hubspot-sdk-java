// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents.listassociations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListAssociationListByExternalAccountParamsTest {

    @Test
    fun create() {
        ListAssociationListByExternalAccountParams.builder()
            .externalAccountId("externalAccountId")
            .externalEventId("externalEventId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListAssociationListByExternalAccountParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        assertThat(params._pathParam(1)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
