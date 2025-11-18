// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions

import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionUpdateLabelParamsTest {

    @Test
    fun create() {
        DefinitionUpdateLabelParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .publicAssociationDefinitionUpdateRequest(
                PublicAssociationDefinitionUpdateRequest.builder()
                    .associationTypeId(0)
                    .label("label")
                    .inverseLabel("inverseLabel")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionUpdateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionUpdateRequest(
                    PublicAssociationDefinitionUpdateRequest.builder()
                        .associationTypeId(0)
                        .label("label")
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
            DefinitionUpdateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionUpdateRequest(
                    PublicAssociationDefinitionUpdateRequest.builder()
                        .associationTypeId(0)
                        .label("label")
                        .inverseLabel("inverseLabel")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionUpdateRequest.builder()
                    .associationTypeId(0)
                    .label("label")
                    .inverseLabel("inverseLabel")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DefinitionUpdateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionUpdateRequest(
                    PublicAssociationDefinitionUpdateRequest.builder()
                        .associationTypeId(0)
                        .label("label")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionUpdateRequest.builder()
                    .associationTypeId(0)
                    .label("label")
                    .build()
            )
    }
}
