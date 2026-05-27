// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal.subscriptions

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot.sdk.models.AssociationSubscriptionUpsertRequest
import com.hubspot.sdk.models.GdprPrivacyDeletionSubscriptionUpsertRequest
import com.hubspot.sdk.models.ListMembershipSubscriptionUpsertRequest
import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.SubscriptionUpsertRequest
import java.util.Objects

/**
 * Create a new subscription in the Webhooks Journal for the specified version. This endpoint allows
 * you to define the subscription details by providing the necessary information in the request
 * body. It supports various types of subscriptions, including object, association, event, app
 * lifecycle event, list membership, and GDPR privacy deletion. Ensure that all required fields are
 * included in the request to successfully create a subscription.
 */
class SubscriptionCreateParams
private constructor(
    private val subscriptionUpsertRequest: SubscriptionUpsertRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionUpsertRequest(): SubscriptionUpsertRequest = subscriptionUpsertRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .subscriptionUpsertRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateParams]. */
    class Builder internal constructor() {

        private var subscriptionUpsertRequest: SubscriptionUpsertRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            subscriptionUpsertRequest = subscriptionCreateParams.subscriptionUpsertRequest
            additionalHeaders = subscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionUpsertRequest(subscriptionUpsertRequest: SubscriptionUpsertRequest) =
            apply {
                this.subscriptionUpsertRequest = subscriptionUpsertRequest
            }

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(objectSubscriptionUpsertRequest)`.
         */
        fun subscriptionUpsertRequest(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ) =
            subscriptionUpsertRequest(
                SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest
                )
            )

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofAssociation(association)`.
         */
        fun subscriptionUpsertRequest(association: AssociationSubscriptionUpsertRequest) =
            subscriptionUpsertRequest(SubscriptionUpsertRequest.ofAssociation(association))

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent)`.
         */
        fun subscriptionUpsertRequest(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ) =
            subscriptionUpsertRequest(
                SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent)
            )

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofListMembership(listMembership)`.
         */
        fun subscriptionUpsertRequest(listMembership: ListMembershipSubscriptionUpsertRequest) =
            subscriptionUpsertRequest(SubscriptionUpsertRequest.ofListMembership(listMembership))

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion)`.
         */
        fun subscriptionUpsertRequest(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ) =
            subscriptionUpsertRequest(
                SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion)
            )

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SubscriptionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subscriptionUpsertRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
                checkRequired("subscriptionUpsertRequest", subscriptionUpsertRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SubscriptionUpsertRequest = subscriptionUpsertRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateParams &&
            subscriptionUpsertRequest == other.subscriptionUpsertRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionUpsertRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionCreateParams{subscriptionUpsertRequest=$subscriptionUpsertRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
