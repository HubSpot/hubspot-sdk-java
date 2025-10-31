// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.marketing.FormServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FormServiceAsync.list */
class FormListPageAsync
private constructor(
    private val service: FormServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FormListParams,
    private val response: CollectionResponseFormDefinitionBaseForwardPaging,
) : PageAsync<HubSpotFormDefinition> {

    /**
     * Delegates to [CollectionResponseFormDefinitionBaseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseFormDefinitionBaseForwardPaging.results
     */
    fun results(): List<HubSpotFormDefinition> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseFormDefinitionBaseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseFormDefinitionBaseForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<HubSpotFormDefinition> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FormListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FormListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<HubSpotFormDefinition> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FormListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFormDefinitionBaseForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FormListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormListPageAsync]. */
    class Builder internal constructor() {

        private var service: FormServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FormListParams? = null
        private var response: CollectionResponseFormDefinitionBaseForwardPaging? = null

        @JvmSynthetic
        internal fun from(formListPageAsync: FormListPageAsync) = apply {
            service = formListPageAsync.service
            streamHandlerExecutor = formListPageAsync.streamHandlerExecutor
            params = formListPageAsync.params
            response = formListPageAsync.response
        }

        fun service(service: FormServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FormListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFormDefinitionBaseForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FormListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormListPageAsync =
            FormListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FormListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
