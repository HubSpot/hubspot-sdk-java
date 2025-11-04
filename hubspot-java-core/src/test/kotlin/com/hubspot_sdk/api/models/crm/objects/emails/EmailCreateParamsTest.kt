// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.emails

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpec1
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailCreateParamsTest {

    @Test
    fun create() {
        EmailCreateParams.builder()
            .simplePublicObjectInputForCreate(
                SimplePublicObjectInputForCreate.builder()
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("37295").build())
                            .addType(
                                AssociationSpec1.builder()
                                    .associationCategory(
                                        AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailCreateParams.builder()
                .simplePublicObjectInputForCreate(
                    SimplePublicObjectInputForCreate.builder()
                        .properties(
                            SimplePublicObjectInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addAssociation(
                            PublicAssociationsForObject.builder()
                                .to(PublicObjectId.builder().id("37295").build())
                                .addType(
                                    AssociationSpec1.builder()
                                        .associationCategory(
                                            AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SimplePublicObjectInputForCreate.builder()
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("37295").build())
                            .addType(
                                AssociationSpec1.builder()
                                    .associationCategory(
                                        AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailCreateParams.builder()
                .simplePublicObjectInputForCreate(
                    SimplePublicObjectInputForCreate.builder()
                        .properties(
                            SimplePublicObjectInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SimplePublicObjectInputForCreate.builder()
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
