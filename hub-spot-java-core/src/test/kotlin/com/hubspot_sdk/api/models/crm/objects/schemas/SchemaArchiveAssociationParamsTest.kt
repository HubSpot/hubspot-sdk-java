// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaArchiveAssociationParamsTest {

    @Test
    fun create() {
        SchemaArchiveAssociationParams.builder()
            .objectType("objectType")
            .associationIdentifier("associationIdentifier")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SchemaArchiveAssociationParams.builder()
                .objectType("objectType")
                .associationIdentifier("associationIdentifier")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("associationIdentifier")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
