// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationDefinitionEgg
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchemaEgg
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypeDefinitionPatch
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypePropertyCreate
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SchemaServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        val objectSchema =
            schemaService.create(
                ObjectSchemaEgg.builder()
                    .addAssociatedObject("CONTACT")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("My objects")
                            .singular("My object")
                            .build()
                    )
                    .name("my_object")
                    .addProperty(
                        ObjectTypePropertyCreate.builder()
                            .fieldType("select")
                            .label("My object property")
                            .name("my_object_property")
                            .type(ObjectTypePropertyCreate.Type.ENUMERATION)
                            .description("description")
                            .displayOrder(2)
                            .formField(true)
                            .groupName("my_object_information")
                            .hasUniqueValue(false)
                            .hidden(true)
                            .numberDisplayHint(
                                ObjectTypePropertyCreate.NumberDisplayHint.UNFORMATTED
                            )
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(1)
                                    .hidden(true)
                                    .label("Option A")
                                    .value("A")
                                    .description("Choice number one")
                                    .build()
                            )
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(2)
                                    .hidden(true)
                                    .label("Option B")
                                    .value("B")
                                    .description("Choice number two")
                                    .build()
                            )
                            .optionSortStrategy(
                                ObjectTypePropertyCreate.OptionSortStrategy.DISPLAY_ORDER
                            )
                            .referencedObjectType("referencedObjectType")
                            .searchableInGlobalSearch(true)
                            .showCurrencySymbol(true)
                            .textDisplayHint(
                                ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE
                            )
                            .build()
                    )
                    .addRequiredProperty("my_object_property")
                    .description("description")
                    .primaryDisplayProperty("my_object_property")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )

        objectSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        val objectTypeDefinition =
            schemaService.update(
                SchemaUpdateParams.builder()
                    .objectType("objectType")
                    .objectTypeDefinitionPatch(
                        ObjectTypeDefinitionPatch.builder()
                            .clearDescription(true)
                            .description("description")
                            .labels(
                                ObjectTypeDefinitionLabels.builder()
                                    .plural("plural")
                                    .singular("singular")
                                    .build()
                            )
                            .primaryDisplayProperty("my_object_property")
                            .addRequiredProperty("my_object_property")
                            .restorable(true)
                            .addSearchableProperty("my_object_property")
                            .addSecondaryDisplayProperty("string")
                            .build()
                    )
                    .build()
            )

        objectTypeDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        val collectionResponseObjectSchemaNoPaging =
            schemaService.list(SchemaListParams.builder().archived(true).build())

        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        schemaService.delete(
            SchemaDeleteParams.builder().objectType("objectType").archived(true).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createAssociation() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        val response =
            schemaService.createAssociation(
                SchemaCreateAssociationParams.builder()
                    .objectType("objectType")
                    .associationDefinitionEgg(
                        AssociationDefinitionEgg.builder()
                            .fromObjectTypeId("fromObjectTypeId")
                            .toObjectTypeId("toObjectTypeId")
                            .name("name")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAssociation() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        schemaService.deleteAssociation(
            SchemaDeleteAssociationParams.builder()
                .objectType("objectType")
                .associationIdentifier("associationIdentifier")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val schemaService = client.crm().objects().schemas()

        val objectSchema = schemaService.get("objectType")

        objectSchema.validate()
    }
}
