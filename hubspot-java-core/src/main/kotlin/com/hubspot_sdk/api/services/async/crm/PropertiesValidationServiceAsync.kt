// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.propertiesvalidations.CollectionResponsePublicPropertyValidationRuleMapNoPaging
import com.hubspot_sdk.api.models.crm.propertiesvalidations.CollectionResponsePublicPropertyValidationRuleNoPaging
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PublicPropertyValidationRule
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PropertiesValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertiesValidationServiceAsync

    /** Read all properties with validation rules for a given object. */
    fun getByObjectTypeId(
        objectTypeId: String
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        getByObjectTypeId(objectTypeId, PropertiesValidationGetByObjectTypeIdParams.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: PropertiesValidationGetByObjectTypeIdParams =
            PropertiesValidationGetByObjectTypeIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: PropertiesValidationGetByObjectTypeIdParams =
            PropertiesValidationGetByObjectTypeIdParams.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        getByObjectTypeId(objectTypeId, params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: PropertiesValidationGetByObjectTypeIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging>

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: PropertiesValidationGetByObjectTypeIdParams
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        getByObjectTypeId(params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        getByObjectTypeId(
            objectTypeId,
            PropertiesValidationGetByObjectTypeIdParams.none(),
            requestOptions,
        )

    /** Read a property's validation rules identified by {propertyName}. */
    fun getByObjectTypeIdAndPropertyName(
        propertyName: String,
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        getByObjectTypeIdAndPropertyName(propertyName, params, RequestOptions.none())

    /** @see getByObjectTypeIdAndPropertyName */
    fun getByObjectTypeIdAndPropertyName(
        propertyName: String,
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        getByObjectTypeIdAndPropertyName(
            params.toBuilder().propertyName(propertyName).build(),
            requestOptions,
        )

    /** @see getByObjectTypeIdAndPropertyName */
    fun getByObjectTypeIdAndPropertyName(
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        getByObjectTypeIdAndPropertyName(params, RequestOptions.none())

    /** @see getByObjectTypeIdAndPropertyName */
    fun getByObjectTypeIdAndPropertyName(
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging>

    /** Retrieve a specific validation rule for a property identified by its name and rule type. */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
    ): CompletableFuture<PublicPropertyValidationRule> =
        getByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

    /** @see getByObjectTypeIdPropertyNameAndRuleType */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicPropertyValidationRule> =
        getByObjectTypeIdPropertyNameAndRuleType(
            params.toBuilder().ruleType(ruleType).build(),
            requestOptions,
        )

    /** @see getByObjectTypeIdPropertyNameAndRuleType */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
    ): CompletableFuture<PublicPropertyValidationRule> =
        getByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

    /** @see getByObjectTypeIdPropertyNameAndRuleType */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicPropertyValidationRule>

    /** Update a specific validation rule for a property identified by its name and rule type. */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
    ): CompletableFuture<Void?> =
        updateByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

    /** @see updateByObjectTypeIdPropertyNameAndRuleType */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateByObjectTypeIdPropertyNameAndRuleType(
            params.toBuilder().ruleType(ruleType).build(),
            requestOptions,
        )

    /** @see updateByObjectTypeIdPropertyNameAndRuleType */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
    ): CompletableFuture<Void?> =
        updateByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

    /** @see updateByObjectTypeIdPropertyNameAndRuleType */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [PropertiesValidationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertiesValidationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/property-validations/2026-03/{objectTypeId}`,
         * but is otherwise the same as [PropertiesValidationServiceAsync.getByObjectTypeId].
         */
        fun getByObjectTypeId(
            objectTypeId: String
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = getByObjectTypeId(objectTypeId, PropertiesValidationGetByObjectTypeIdParams.none())

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            objectTypeId: String,
            params: PropertiesValidationGetByObjectTypeIdParams =
                PropertiesValidationGetByObjectTypeIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            objectTypeId: String,
            params: PropertiesValidationGetByObjectTypeIdParams =
                PropertiesValidationGetByObjectTypeIdParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = getByObjectTypeId(objectTypeId, params, RequestOptions.none())

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            params: PropertiesValidationGetByObjectTypeIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        >

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            params: PropertiesValidationGetByObjectTypeIdParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = getByObjectTypeId(params, RequestOptions.none())

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > =
            getByObjectTypeId(
                objectTypeId,
                PropertiesValidationGetByObjectTypeIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/property-validations/2026-03/{objectTypeId}/{propertyName}`, but is otherwise the
         * same as [PropertiesValidationServiceAsync.getByObjectTypeIdAndPropertyName].
         */
        fun getByObjectTypeIdAndPropertyName(
            propertyName: String,
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > = getByObjectTypeIdAndPropertyName(propertyName, params, RequestOptions.none())

        /** @see getByObjectTypeIdAndPropertyName */
        fun getByObjectTypeIdAndPropertyName(
            propertyName: String,
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > =
            getByObjectTypeIdAndPropertyName(
                params.toBuilder().propertyName(propertyName).build(),
                requestOptions,
            )

        /** @see getByObjectTypeIdAndPropertyName */
        fun getByObjectTypeIdAndPropertyName(
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > = getByObjectTypeIdAndPropertyName(params, RequestOptions.none())

        /** @see getByObjectTypeIdAndPropertyName */
        fun getByObjectTypeIdAndPropertyName(
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        >

        /**
         * Returns a raw HTTP response for `get
         * /crm/property-validations/2026-03/{objectTypeId}/{propertyName}/rule-type/{ruleType}`,
         * but is otherwise the same as
         * [PropertiesValidationServiceAsync.getByObjectTypeIdPropertyNameAndRuleType].
         */
        fun getByObjectTypeIdPropertyNameAndRuleType(
            ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        ): CompletableFuture<HttpResponseFor<PublicPropertyValidationRule>> =
            getByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

        /** @see getByObjectTypeIdPropertyNameAndRuleType */
        fun getByObjectTypeIdPropertyNameAndRuleType(
            ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicPropertyValidationRule>> =
            getByObjectTypeIdPropertyNameAndRuleType(
                params.toBuilder().ruleType(ruleType).build(),
                requestOptions,
            )

        /** @see getByObjectTypeIdPropertyNameAndRuleType */
        fun getByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
        ): CompletableFuture<HttpResponseFor<PublicPropertyValidationRule>> =
            getByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

        /** @see getByObjectTypeIdPropertyNameAndRuleType */
        fun getByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicPropertyValidationRule>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/property-validations/2026-03/{objectTypeId}/{propertyName}/rule-type/{ruleType}`,
         * but is otherwise the same as
         * [PropertiesValidationServiceAsync.updateByObjectTypeIdPropertyNameAndRuleType].
         */
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            ruleType:
                PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        ): CompletableFuture<HttpResponse> =
            updateByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

        /** @see updateByObjectTypeIdPropertyNameAndRuleType */
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            ruleType:
                PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateByObjectTypeIdPropertyNameAndRuleType(
                params.toBuilder().ruleType(ruleType).build(),
                requestOptions,
            )

        /** @see updateByObjectTypeIdPropertyNameAndRuleType */
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
        ): CompletableFuture<HttpResponse> =
            updateByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

        /** @see updateByObjectTypeIdPropertyNameAndRuleType */
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
