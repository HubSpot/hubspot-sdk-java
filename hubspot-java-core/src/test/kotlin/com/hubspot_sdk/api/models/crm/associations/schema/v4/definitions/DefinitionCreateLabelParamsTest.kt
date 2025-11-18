// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions

import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionCreateLabelParamsTest {

    @Test
    fun create() {
        DefinitionCreateLabelParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .publicAssociationDefinitionCreateRequest(
                PublicAssociationDefinitionCreateRequest.builder()
                    .label("label")
                    .name("name")
                    .inverseLabel("inverseLabel")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionCreateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionCreateRequest(
                    PublicAssociationDefinitionCreateRequest.builder()
                        .label("label")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DefinitionCreateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionCreateRequest(
                    PublicAssociationDefinitionCreateRequest.builder()
                        .label("label")
                        .name("name")
                        .inverseLabel("inverseLabel")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionCreateRequest.builder()
                    .label("label")
                    .name("name")
                    .inverseLabel("inverseLabel")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DefinitionCreateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionCreateRequest(
                    PublicAssociationDefinitionCreateRequest.builder()
                        .label("label")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionCreateRequest.builder()
                    .label("label")
                    .name("name")
                    .build()
            )
    }
}
