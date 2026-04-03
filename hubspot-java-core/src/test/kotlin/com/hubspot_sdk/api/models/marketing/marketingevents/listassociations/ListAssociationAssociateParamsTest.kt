// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents.listassociations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListAssociationAssociateParamsTest {

    @Test
    fun create() {
        ListAssociationAssociateParams.builder()
            .marketingEventId("marketingEventId")
            .listId("listId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListAssociationAssociateParams.builder()
                .marketingEventId("marketingEventId")
                .listId("listId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("marketingEventId")
        assertThat(params._pathParam(1)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
