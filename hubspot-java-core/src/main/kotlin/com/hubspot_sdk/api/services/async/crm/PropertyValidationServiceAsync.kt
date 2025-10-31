// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetResponse
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PropertyValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyValidationServiceAsync

    /** Read all properties with validation rules for a given object. */
    fun list(objectTypeId: String): CompletableFuture<PropertyValidationListResponse> =
        list(objectTypeId, PropertyValidationListParams.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyValidationListResponse> =
        list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
    ): CompletableFuture<PropertyValidationListResponse> =
        list(objectTypeId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyValidationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyValidationListResponse>

    /** @see list */
    fun list(
        params: PropertyValidationListParams
    ): CompletableFuture<PropertyValidationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyValidationListResponse> =
        list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

    /** Read a property's validation rules identified by {propertyName}. */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
    ): CompletableFuture<PropertyValidationGetResponse> =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyValidationGetResponse> =
        get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(params: PropertyValidationGetParams): CompletableFuture<PropertyValidationGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyValidationGetResponse>

    /**
     * A view of [PropertyValidationServiceAsync] that provides access to raw HTTP responses for
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
        ): PropertyValidationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/property-validations/{objectTypeId}`, but is
         * otherwise the same as [PropertyValidationServiceAsync.list].
         */
        fun list(
            objectTypeId: String
        ): CompletableFuture<HttpResponseFor<PropertyValidationListResponse>> =
            list(objectTypeId, PropertyValidationListParams.none())

        /** @see list */
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyValidationListResponse>> =
            list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see list */
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
        ): CompletableFuture<HttpResponseFor<PropertyValidationListResponse>> =
            list(objectTypeId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PropertyValidationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyValidationListResponse>>

        /** @see list */
        fun list(
            params: PropertyValidationListParams
        ): CompletableFuture<HttpResponseFor<PropertyValidationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyValidationListResponse>> =
            list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/property-validations/{objectTypeId}/{propertyName}`, but is otherwise the same as
         * [PropertyValidationServiceAsync.get].
         */
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
        ): CompletableFuture<HttpResponseFor<PropertyValidationGetResponse>> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyValidationGetResponse>> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        fun get(
            params: PropertyValidationGetParams
        ): CompletableFuture<HttpResponseFor<PropertyValidationGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyValidationGetResponse>>
    }
}
