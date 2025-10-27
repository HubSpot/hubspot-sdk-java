// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.associations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationDeleteByExternalAccountParamsTest {

    @Test
    fun create() {
        AssociationDeleteByExternalAccountParams.builder()
            .externalAccountId("externalAccountId")
            .externalEventId("externalEventId")
            .listId("listId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssociationDeleteByExternalAccountParams.builder()
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
