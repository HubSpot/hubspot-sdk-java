// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.projects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationListPageAsync
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync

    fun update(
        associationType: String,
        params: AssociationUpdateParams,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        update(associationType, params, RequestOptions.none())

    /** @see update */
    fun update(
        associationType: String,
        params: AssociationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        update(params.toBuilder().associationType(associationType).build(), requestOptions)

    /** @see update */
    fun update(
        params: AssociationUpdateParams
    ): CompletableFuture<SimplePublicObjectWithAssociations> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssociationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    fun list(
        toObjectType: String,
        params: AssociationListParams,
    ): CompletableFuture<AssociationListPageAsync> =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationListPageAsync> =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: AssociationListParams): CompletableFuture<AssociationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationListPageAsync>

    fun delete(associationType: String, params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(associationType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        associationType: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().associationType(associationType).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AssociationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/objects/v3/projects/{projectId}/associations/{toObjectType}/{toObjectId}/{associationType}`,
         * but is otherwise the same as [AssociationServiceAsync.update].
         */
        fun update(
            associationType: String,
            params: AssociationUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            update(associationType, params, RequestOptions.none())

        /** @see update */
        fun update(
            associationType: String,
            params: AssociationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            update(params.toBuilder().associationType(associationType).build(), requestOptions)

        /** @see update */
        fun update(
            params: AssociationUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AssociationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/v3/projects/{projectId}/associations/{toObjectType}`, but is otherwise the
         * same as [AssociationServiceAsync.list].
         */
        fun list(
            toObjectType: String,
            params: AssociationListParams,
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            toObjectType: String,
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: AssociationListParams
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/v3/projects/{projectId}/associations/{toObjectType}/{toObjectId}/{associationType}`,
         * but is otherwise the same as [AssociationServiceAsync.delete].
         */
        fun delete(
            associationType: String,
            params: AssociationDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(associationType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            associationType: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().associationType(associationType).build(), requestOptions)

        /** @see delete */
        fun delete(params: AssociationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
