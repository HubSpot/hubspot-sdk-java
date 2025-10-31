// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.CreatedResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListPageAsync
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateParams
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V4ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync

    fun batch(): BatchServiceAsync

    fun report(): ReportServiceAsync

    /** Create the default (most generic) association type between two object types */
    fun create(
        toObjectId: String,
        params: V4CreateParams,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(toObjectId, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectId: String,
        params: V4CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see create */
    fun create(params: V4CreateParams): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V4CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation>

    /** Set association labels between two records. */
    fun update(
        toObjectId: String,
        params: V4UpdateParams,
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        update(toObjectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        toObjectId: String,
        params: V4UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        update(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see update */
    fun update(params: V4UpdateParams): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V4UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair>

    /** List all associations of an object by object type. Limit 500 per call. */
    fun list(toObjectType: String, params: V4ListParams): CompletableFuture<V4ListPageAsync> =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: V4ListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V4ListPageAsync> =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: V4ListParams): CompletableFuture<V4ListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: V4ListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V4ListPageAsync>

    /** deletes all associations between two records. */
    fun delete(toObjectId: String, params: V4DeleteParams): CompletableFuture<Void?> =
        delete(toObjectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectId: String,
        params: V4DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: V4DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V4DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [V4ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun report(): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [V4ServiceAsync.create].
         */
        fun create(
            toObjectId: String,
            params: V4CreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(toObjectId, params, RequestOptions.none())

        /** @see create */
        fun create(
            toObjectId: String,
            params: V4CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see create */
        fun create(
            params: V4CreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: V4CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4ServiceAsync.update].
         */
        fun update(
            toObjectId: String,
            params: V4UpdateParams,
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> =
            update(toObjectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            toObjectId: String,
            params: V4UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> =
            update(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: V4UpdateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: V4UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}`, but is otherwise
         * the same as [V4ServiceAsync.list].
         */
        fun list(
            toObjectType: String,
            params: V4ListParams,
        ): CompletableFuture<HttpResponseFor<V4ListPageAsync>> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            toObjectType: String,
            params: V4ListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V4ListPageAsync>> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        fun list(params: V4ListParams): CompletableFuture<HttpResponseFor<V4ListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: V4ListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V4ListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4ServiceAsync.delete].
         */
        fun delete(toObjectId: String, params: V4DeleteParams): CompletableFuture<HttpResponse> =
            delete(toObjectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toObjectId: String,
            params: V4DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see delete */
        fun delete(params: V4DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V4DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
