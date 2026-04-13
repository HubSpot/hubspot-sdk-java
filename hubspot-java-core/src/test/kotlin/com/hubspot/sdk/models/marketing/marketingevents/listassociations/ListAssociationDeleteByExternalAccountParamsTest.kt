// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.listassociations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListAssociationDeleteByExternalAccountParamsTest {

    @Test
    fun create() {
        ListAssociationDeleteByExternalAccountParams.builder()
            .externalAccountId("externalAccountId")
            .externalEventId("externalEventId")
            .listId("listId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListAssociationDeleteByExternalAccountParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .listId("listId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        assertThat(params._pathParam(1)).isEqualTo("externalEventId")
        assertThat(params._pathParam(2)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
